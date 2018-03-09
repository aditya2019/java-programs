class CopyConstructorNoCallByReferenceInJava
{
	int x,y;
	CopyConstructorNoCallByReferenceInJava(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	CopyConstructorNoCallByReferenceInJava(CopyConstructorNoCallByReferenceInJava z)
	{
		this.x=z.x;
		this.y=z.y;
			z.x=30;
	}
	void CopyConstructorNoCallByReferenceInJava()
	{
		System.out.println(x+" , "+y);
	}
public static void main(String...s)
{
	CopyConstructorNoCallByReferenceInJava c=new CopyConstructorNoCallByReferenceInJava(10,20);
	CopyConstructorNoCallByReferenceInJava d=new CopyConstructorNoCallByReferenceInJava(c);
	c.CopyConstructorNoCallByReferenceInJava();
	d.CopyConstructorNoCallByReferenceInJava();

}	
}
/*because due to change in formal argument (z)(z.x=30) actual argument (d.x) does't change*
so java does support call by reference/