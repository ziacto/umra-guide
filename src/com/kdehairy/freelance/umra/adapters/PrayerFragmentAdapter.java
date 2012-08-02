package com.kdehairy.freelance.umra.adapters;

import java.util.List;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.kdehairy.freelance.umra.PrayerFragment;
import com.kdehairy.freelance.umra.model.Prayer;
import com.kdehairy.freelance.umra.model.Toc;

public class PrayerFragmentAdapter extends FragmentPagerAdapter {
	
	private final List<Prayer> mPrayers;

	public PrayerFragmentAdapter(FragmentManager fm, Context context, Toc topic) {
		super(fm);
		mPrayers = topic.getPrayers(context);
	}

	@Override
	public Fragment getItem(int position) {
		PrayerFragment fragment = null;
		if (mPrayers != null && mPrayers.size() > 0) {
			fragment = PrayerFragment.createInstance(mPrayers.get(position));
		}
		return fragment;
	}

	@Override
	public int getCount() {
		int size = 0;
		if (mPrayers != null) {
			size = mPrayers.size();
		}
		return size;
	}

}