# Coprime
import java.io.*;
import java.util.*;
public class Coprime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any two numbers:");
int n1=br.readLine();
int n2=br.readLine();
int c=0,c1=0,flag=0;
int arr1[]=new int[n1/2];
int arr2[]=new int[n2/2];
for(int i=1;i<n1-1;i++)
{
if(n1%i==0)
{
arr[c]=i;
c++;
}
}
for(int j=1;j<n2-1;j++)
{
if(n%2j==0)
{
arr2[c1]=j;
c1++;
}
}
for(int k=0;k<c;k++)
{
for(int l=0;l<c1;l++)
{
if(arr1[k]==arr2[l] && arr1[k]!=1)
{
flag=1;
}
}
}
if(flag==1)
System.out.println("not coprime");
else
System.out.println("coprime");
}
}
