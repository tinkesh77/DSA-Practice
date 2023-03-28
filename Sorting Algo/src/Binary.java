public class Binary {
    public static void main(String args[])
    {

        // a[5]=33;
        int arr[] = {1,2,3,4,5};
        Bin b1=new Bin();
        System.out.println(b1.Binarys(arr,0,4,6));
    }

}
class Bin
{

    int Binarys(int nums[],int l,int h,int key)
    {
        while(l<=h)
        {
            int  mid=(l+h)/2;
            if(key==nums[mid])
            {
                return mid;
            }
            if(key<nums[mid])
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return -1;
    }
}