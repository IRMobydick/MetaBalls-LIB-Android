package no.danielzeller.metaballs

import android.graphics.drawable.Drawable
import no.danielzeller.metaballslib.MetaBallAdapter

class CircularMenuAdapter(val drawables: List<MenuItem>) : MetaBallAdapter {
    override fun menuItemIconTint(index: Int): Int {
        return drawables[index].drawableTint
    }

    override fun menuItemBackgroundColor(index: Int): Int {
        return drawables[index].backgroundColor
    }

    override fun menuItemIcon(index: Int): Drawable? {
        return drawables[index].drawable
    }

    override fun itemsCount(): Int {
        return drawables.count()
    }
}

class MenuItem(val backgroundColor: Int, val drawable: Drawable, val drawableTint: Int)