package md58ffd707bb572054464ce3d1f46419897;


public class MainActivity_ViewPagerAdapter
	extends android.support.v4.view.PagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_ViewGroup_IHandler\n" +
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_isViewFromObject:(Landroid/view/View;Ljava/lang/Object;)Z:GetIsViewFromObject_Landroid_view_View_Ljava_lang_Object_Handler\n" +
			"n_destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V:GetDestroyItem_Landroid_view_ViewGroup_ILjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("SliderForTheFirstLaunch.MainActivity+ViewPagerAdapter, SliderForTheFirstLaunch, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity_ViewPagerAdapter.class, __md_methods);
	}


	public MainActivity_ViewPagerAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity_ViewPagerAdapter.class)
			mono.android.TypeManager.Activate ("SliderForTheFirstLaunch.MainActivity+ViewPagerAdapter, SliderForTheFirstLaunch, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MainActivity_ViewPagerAdapter (int[] p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity_ViewPagerAdapter.class)
			mono.android.TypeManager.Activate ("SliderForTheFirstLaunch.MainActivity+ViewPagerAdapter, SliderForTheFirstLaunch, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Int32[], mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
	}


	public java.lang.Object instantiateItem (android.view.ViewGroup p0, int p1)
	{
		return n_instantiateItem (p0, p1);
	}

	private native java.lang.Object n_instantiateItem (android.view.ViewGroup p0, int p1);


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public boolean isViewFromObject (android.view.View p0, java.lang.Object p1)
	{
		return n_isViewFromObject (p0, p1);
	}

	private native boolean n_isViewFromObject (android.view.View p0, java.lang.Object p1);


	public void destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2)
	{
		n_destroyItem (p0, p1, p2);
	}

	private native void n_destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
