package com.example.estoque;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Views_Pager extends FragmentStatePagerAdapter {

    int Countab;
    @SuppressWarnings("deprecation")
    public Views_Pager(FragmentManager frgm, int Contab) {
        super(frgm);
        this.Countab = Contab;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag = null;
        switch (position){

            case 0:
                frag = new Add_Item();
                break;
            case 1:
                frag = new Lista_Estoque();
                break;
            case 2:
                frag = new Dados_Func();
                break;

        }

        return frag;
    }

    @Override
    public int getCount() {
        return Countab;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
