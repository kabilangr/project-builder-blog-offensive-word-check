package utility;
import model.*;
public class  CheckBlogPost extends OffensiveWordsChecker  implements OffensiveWordsInterface
{
	String array[]= {"asswad","asswhole","asswipe","asswipes","bangbros","beastiality","biatch","bi+ch","bimbos","bitch","black cock"};
	
	                public boolean checkBlog(Blog blog) {
	                	if((checkBlogTitle(blog))||(checkBlogDescription(blog)))
	                	{
	                		return false;
	                	}
	                	return true;
	                }
	                public boolean checkBlogTitle(Blog blog)
	                {
	                	String t=blog.getBlogTitle();
	                	for(int i=0;i<array.length;i++)
	                	{
	                		if(t.equalsIgnoreCase(array[i]))
	                		{
	                			return true;
	                		}
	                	}
	                	return false;
	                }
	                public boolean checkBlogDescription(Blog blog)
	                {

	                	String t=blog.getBlogDescription();
	                	for(int i=0;i<array.length;i++)
	                	{
	                		if(t.equalsIgnoreCase(array[i]))
	                		{
	                			return true;
	                		}
	                	}
	                	return false;
	                }
	                 
}