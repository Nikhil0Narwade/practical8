class Practical8 {

static void pattern1(int line, int size){
		
		
		if(line > 2*size + 1){
				return;
			}
			else if(line <= size + 1){
				printStar(line);
			}
		else if(line > size + 1){
				printStar(line - (2*line - 2*size - 2));			
			}
			System.out.println();
		pattern1(line + 1, size);
	}
	
	
	
static void pattern2(int line, int size){
			if(line > 2*size + 1){
				return;
		}
			else if(line < size+1){
				printSpace(size+1-line);
			printStar(line);
			}
		else if(line == size+1){
				printPlus(line);
		    }
		else
		{
				printSpace(line-(size+1));
			printSlash(line - (2*line - 2*size - 2));
		}
			System.out.println();
	pattern2(line+1, size);
	}
	
	
	
static void pattern3(int line, int size){
	if(size%2 == 1){
				if(line > 2*size){
			return;
		}
			
			
		else if(line <= size/2+1){
			printSpace((size/2+1) - line);
				printStar(2*line-1);
		}
			else if(line > size/2+1 && line <= size){
					printSpace(line-(size/2+1));
			printStar(2*(2*(size/2+1)-line)-1);
			
		}
				else
					{
					printSpace(size/2);
				System.out.print("+");
			}
				System.out.println();
			pattern3(line+1, size);
		}
		else
		{
				if(line > 2*size){
					return;
			}
				else if(line <= size/2){
				printSpace(size/2-line);
				printStar(2*line-1);
			}
			
			else if(line > size/2 && line <= size){
					printSpace(line-(size/2+1));
				printStar(2*(2*(size/2)-line)+1);
			}
			
			else
			{
					printSpace(size/2-1);
				System.out.print("+");
			}
				System.out.println();
			pattern3(line+1, size);
		}
	}
	
	
	
	static void printSpace(int space)
	{
			if(space == 0){
				return;
		}
		
		else
		{
				System.out.print(" ");
			printSpace(space - 1);
		}
	}
	
	static void printStar(int star)
	
	{
		if(star == 0)
		{
			return;
		}
		else
		{
				System.out.print("*");
			printStar(star - 1);
		}
	}
	
	static void printPlus(int plus){
		if(plus == 0)
		{
			return;
		}
		else
		{
				System.out.print("+");
			printPlus(plus - 1);
		}
	}
	
	static void printSlash(int slash){
		if(slash == 0)
		{
			return;
		}
		else
		{
				System.out.print("/");
			printSlash(slash - 1);
		}
	}

	public static void main(String[] args){
		pattern1(1, 3);
		System.out.println();
		pattern2(1, 3);
		System.out.println();
		pattern3(1, 5);
		System.out.println();
		
	}
}
