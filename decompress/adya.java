import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adya implements alx
{
    final Object a;
    final Object b;
    private final int c;
    
    public adya(final adva b, final adyc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adya(final askq a, final View b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final aoc a(final View view, final aoc aoc) {
        if (this.c != 0) {
            final Object a = this.a;
            final Object b = this.b;
            if (!((askq)a).tz()) {
                ((askd)a).c(tso.a(tri.a(tqf.i(aoc.f(7)), tqf.m((View)b), tqf.i(aoc.f(32)), tqf.i(aoc.b.c(7)))));
            }
            return aoc;
        }
        final Object b2 = this.b;
        final adyc adyc = new adyc((adyc)this.a);
        final aic f = aoc.f(7);
        final aic f2 = aoc.f(32);
        final adva adva = (adva)b2;
        ((BottomSheetBehavior)adva.b).p = f.c;
        final boolean d = adfe.D(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        final BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior)adva.b;
        if (bottomSheetBehavior.i) {
            bottomSheetBehavior.o = aoc.a();
            paddingBottom = adyc.d + ((BottomSheetBehavior)adva.b).o;
        }
        final BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior)adva.b;
        if (bottomSheetBehavior2.j) {
            int n;
            if (d) {
                n = adyc.c;
            }
            else {
                n = adyc.a;
            }
            paddingLeft = n + f.b;
        }
        if (bottomSheetBehavior2.k) {
            int n2;
            if (d) {
                n2 = adyc.a;
            }
            else {
                n2 = adyc.c;
            }
            paddingRight = n2 + f.d;
        }
        final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final boolean l = ((BottomSheetBehavior)adva.b).l;
        final int n3 = 1;
        int n4 = 0;
        if (l) {
            final int leftMargin = layoutParams.leftMargin;
            final int b3 = f.b;
            n4 = n4;
            if (leftMargin != b3) {
                layoutParams.leftMargin = b3;
                n4 = 1;
            }
        }
        if (((BottomSheetBehavior)adva.b).m) {
            final int rightMargin = layoutParams.rightMargin;
            final int d2 = f.d;
            if (rightMargin != d2) {
                layoutParams.rightMargin = d2;
                n4 = n3;
            }
        }
        Label_0485: {
            Label_0479: {
                if (((BottomSheetBehavior)adva.b).n) {
                    final int topMargin = layoutParams.topMargin;
                    final int c = f.c;
                    if (topMargin != c) {
                        layoutParams.topMargin = c;
                        break Label_0479;
                    }
                }
                if (n4 == 0) {
                    break Label_0485;
                }
            }
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        final boolean a2 = adva.a;
        if (a2) {
            ((BottomSheetBehavior)adva.b).g = f2.e;
        }
        final BottomSheetBehavior bottomSheetBehavior3 = (BottomSheetBehavior)adva.b;
        if (bottomSheetBehavior3.i || a2) {
            bottomSheetBehavior3.N();
        }
        return aoc;
    }
}
