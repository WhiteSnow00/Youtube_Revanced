import java.util.List;
import android.graphics.drawable.Drawable;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class dxt implements dxv
{
    private final /* synthetic */ int a;
    
    public dxt(final int a) {
        this.a = a;
    }
    
    @Override
    public final float a(final Object o) {
        final int a = this.a;
        if (a == 0) {
            int n;
            if (o instanceof View) {
                n = ((View)o).getHeight();
            }
            else {
                if (!(o instanceof Drawable)) {
                    throw new UnsupportedOperationException("Getting height from unsupported mount content: ".concat(o.toString()));
                }
                n = ((Drawable)o).getBounds().height();
            }
            return (float)n;
        }
        if (a != 1) {
            if (a == 2) {
                return dxu.b(o, this).getRotation();
            }
            if (a != 3) {
                if (a == 4) {
                    int n2;
                    if (o instanceof View) {
                        n2 = ((View)o).getWidth();
                    }
                    else {
                        if (!(o instanceof Drawable)) {
                            throw new UnsupportedOperationException("Getting width from unsupported mount content: ".concat(o.toString()));
                        }
                        n2 = ((Drawable)o).getBounds().width();
                    }
                    return (float)n2;
                }
                if (a != 5) {
                    float n3;
                    if (o instanceof efw && o instanceof egg) {
                        n3 = ((efw)o).getY();
                    }
                    else if (o instanceof View) {
                        n3 = dxu.a((View)o, false);
                    }
                    else {
                        if (!(o instanceof Drawable)) {
                            throw new UnsupportedOperationException("Getting Y from unsupported mount content: ".concat(o.toString()));
                        }
                        final Drawable drawable = (Drawable)o;
                        n3 = drawable.getBounds().top + dxu.a(dxu.c(drawable), false);
                    }
                    return n3;
                }
                float n4;
                if (o instanceof efw && o instanceof egg) {
                    n4 = ((efw)o).getX();
                }
                else if (o instanceof View) {
                    n4 = dxu.a((View)o, true);
                }
                else {
                    if (!(o instanceof Drawable)) {
                        throw new UnsupportedOperationException("Getting X from unsupported mount content: ".concat(o.toString()));
                    }
                    final Drawable drawable2 = (Drawable)o;
                    n4 = drawable2.getBounds().left + dxu.a(dxu.c(drawable2), true);
                }
                return n4;
            }
            else {
                final View b = dxu.b(o, this);
                final float scaleX = b.getScaleX();
                if (scaleX == b.getScaleY()) {
                    return scaleX;
                }
                throw new RuntimeException("Tried to get scale of view, but scaleX and scaleY are different");
            }
        }
        else {
            if (o instanceof View) {
                return ((View)o).getAlpha();
            }
            throw new UnsupportedOperationException("Tried to get alpha of unsupported mount content: ".concat(o.toString()));
        }
    }
    
    @Override
    public final String b() {
        final int a = this.a;
        if (a == 0) {
            return "height";
        }
        if (a == 1) {
            return "alpha";
        }
        if (a == 2) {
            return "rotation";
        }
        if (a == 3) {
            return "scale";
        }
        if (a == 4) {
            return "width";
        }
        if (a != 5) {
            return "y";
        }
        return "x";
    }
    
    @Override
    public final void c(final Object o) {
        final int a = this.a;
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    dxu.b(o, this).setRotation(0.0f);
                    return;
                }
                if (a != 3) {
                    if (a != 4) {
                        if (a != 5) {
                            if (o instanceof View) {
                                ((View)o).setTranslationY(0.0f);
                            }
                            return;
                        }
                        if (o instanceof View) {
                            ((View)o).setTranslationX(0.0f);
                        }
                    }
                    return;
                }
                final View b = dxu.b(o, this);
                b.setScaleX(1.0f);
                b.setScaleY(1.0f);
            }
            else {
                this.d(o, 1.0f);
            }
        }
    }
    
    @Override
    public final void d(final Object o, final float n) {
        final int a = this.a;
        final int n2 = 0;
        int i = 0;
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    dxu.b(o, this).setRotation(n);
                    return;
                }
                if (a == 3) {
                    final View b = dxu.b(o, this);
                    b.setScaleX(n);
                    b.setScaleY(n);
                    return;
                }
                if (a != 4) {
                    if (a != 5) {
                        if (o instanceof efw && o instanceof egg) {
                            ((View)o).setY(n);
                            return;
                        }
                        if (o instanceof View) {
                            final View view = (View)o;
                            view.setY(n - dxu.a((View)view.getParent(), false));
                            return;
                        }
                        if (o instanceof Drawable) {
                            final Drawable drawable = (Drawable)o;
                            epc.W(drawable, drawable.getBounds().left, (int)(n - dxu.a(dxu.c(drawable), false)));
                            return;
                        }
                        throw new UnsupportedOperationException("Setting Y on unsupported mount content: ".concat(String.valueOf(String.valueOf(o))));
                    }
                    else {
                        if (o instanceof efw && o instanceof egg) {
                            ((View)o).setX(n);
                            return;
                        }
                        if (o instanceof View) {
                            final View view2 = (View)o;
                            view2.setX(n - dxu.a((View)view2.getParent(), true));
                            return;
                        }
                        if (o instanceof Drawable) {
                            final Drawable drawable2 = (Drawable)o;
                            epc.W(drawable2, (int)(n - dxu.a(dxu.c(drawable2), true)), drawable2.getBounds().top);
                            return;
                        }
                        throw new UnsupportedOperationException("Setting X on unsupported mount content: ".concat(String.valueOf(String.valueOf(o))));
                    }
                }
                else {
                    if (o instanceof efw) {
                        final efw efw = (efw)o;
                        if (efw instanceof egl) {
                            ((egl)efw).A((int)n);
                        }
                        else {
                            final int left = efw.getLeft();
                            epc.T(left, efw.getTop(), (int)(left + n), efw.getBottom(), (Object)efw, false);
                        }
                        final List d = dxu.d(efw);
                        if (d != null) {
                            final int n3 = (int)n;
                            final int height = efw.getHeight();
                            while (i < d.size()) {
                                epc.V((Drawable)d.get(i), n3, height);
                                ++i;
                            }
                        }
                        return;
                    }
                    if (o instanceof View) {
                        final View view3 = (View)o;
                        final int left2 = view3.getLeft();
                        epc.T(left2, view3.getTop(), (int)(left2 + n), view3.getBottom(), (Object)view3, false);
                        return;
                    }
                    if (o instanceof Drawable) {
                        final Drawable drawable3 = (Drawable)o;
                        epc.V(drawable3, (int)n, drawable3.getBounds().height());
                        return;
                    }
                    throw new UnsupportedOperationException("Setting width on unsupported mount content: ".concat(String.valueOf(String.valueOf(o))));
                }
            }
            else {
                if (o instanceof View) {
                    ((View)o).setAlpha(n);
                    return;
                }
                throw new UnsupportedOperationException("Setting alpha on unsupported mount content: ".concat(String.valueOf(String.valueOf(o))));
            }
        }
        else {
            if (o instanceof efw) {
                final efw efw2 = (efw)o;
                if (efw2 instanceof egl) {
                    ((egl)efw2).z((int)n);
                }
                else {
                    final int top = efw2.getTop();
                    epc.T(efw2.getLeft(), top, efw2.getRight(), (int)(top + n), (Object)efw2, false);
                }
                final List d2 = dxu.d(efw2);
                if (d2 != null) {
                    final int width = efw2.getWidth();
                    final int n4 = (int)n;
                    for (int j = n2; j < d2.size(); ++j) {
                        epc.V((Drawable)d2.get(j), width, n4);
                    }
                }
                return;
            }
            if (o instanceof View) {
                final View view4 = (View)o;
                final int top2 = view4.getTop();
                epc.T(view4.getLeft(), top2, view4.getRight(), (int)(top2 + n), (Object)view4, false);
                return;
            }
            if (o instanceof Drawable) {
                final Drawable drawable4 = (Drawable)o;
                epc.V(drawable4, drawable4.getBounds().width(), (int)n);
                return;
            }
            throw new UnsupportedOperationException("Setting height on unsupported mount content: ".concat(String.valueOf(String.valueOf(o))));
        }
    }
    
    @Override
    public final float e(final dvc dvc) {
        final int a = this.a;
        int n;
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a != 4) {
                            if (a != 5) {
                                n = dvc.d.top;
                            }
                            else {
                                n = dvc.d.left;
                            }
                        }
                        else {
                            n = dvc.d.width();
                        }
                    }
                    else {
                        final dty m = dvc.m;
                        if (m != null && m.B()) {
                            return m.g;
                        }
                        return 1.0f;
                    }
                }
                else {
                    final dty i = dvc.m;
                    if (i != null && i.y()) {
                        return i.i;
                    }
                    return 0.0f;
                }
            }
            else {
                final dty j = dvc.m;
                if (j != null && j.w()) {
                    return j.h;
                }
                return 1.0f;
            }
        }
        else {
            n = dvc.d.height();
        }
        return (float)n;
    }
}
