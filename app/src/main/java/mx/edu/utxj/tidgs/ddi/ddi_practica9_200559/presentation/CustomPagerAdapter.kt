package mx.edu.utxj.tidgs.ddi.ddi_practica9_200559.presentation


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import mx.edu.utxj.tidgs.ddi.ddi_tarea_4.presentation.Fragment3

class CustomPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> Fragment1()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}
