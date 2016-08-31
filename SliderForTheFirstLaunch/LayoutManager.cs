using System;
using Android.Content;

namespace SliderForTheFirstLaunch
{

	/// <summary>
	/// If the user launches the app on second time,
	///  he should directly go to main screen. 
	/// To achieve this, we use SharedPreferences to store a boolean value indicating first time launch.
	/// </summary>
	public class LayoutManager
	{
		ISharedPreferences sharePref;
		ISharedPreferencesEditor editor;
		Context context;

		// mode

		//shared preferene file name
		private static string pref_name = "Intro Slider";
		private static string is_first_time_lauch = "thefirst";



		public LayoutManager(Context context)
		{
			this.context = context;
			sharePref = this.context.GetSharedPreferences(pref_name,FileCreationMode.Private);
			editor = sharePref.Edit();
		}

		public void setFirstTimeLauch(bool isFirstTime)
		{
			editor.PutBoolean(is_first_time_lauch, isFirstTime);
			editor.Commit();

		}

		public Boolean isFirstTimeLauch()
		{
			return sharePref.GetBoolean(is_first_time_lauch, true);
		}
	}
}

