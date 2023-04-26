package firststep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	int add(String s)
	{
		if (s.length() == 0 || s == null)
		{
			return 0;
		}
		else 
		{
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
			String[] tokens = {};
			if (m.find())
			{
				String customDelimeter = m.group(1);
				tokens = m.group(2).split(customDelimeter);
			}
			else
			{
				tokens = s.split(",|:");
			}
			int result = 0;
			for (int idx = 0; idx < tokens.length; idx++)
			{
				int nowNum = Integer.valueOf(tokens[idx]);
				try 
				{
					if (nowNum < 0)
					{
						throw new RuntimeException();
					}
					result += nowNum;
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			return result;
		}
	}
	
}
