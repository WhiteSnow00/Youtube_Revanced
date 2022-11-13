import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwj implements alw
{
    final Object a;
    final Object b;
    private final int c;
    
    public adwj(final adtj b, final adwl a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adwj(final ashu a, final View b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final aob a(final View view, final aob aob) {
        if (this.c != 0) {
            final Object a = this.a;
            final Object b = this.b;
            if (!((ashu)a).tA()) {
                ((ashh)a).c(trn.a(tqh.a(tpe.i(aob.f(7)), tpe.m((View)b), tpe.i(aob.f(32)), tpe.i(aob.b.c(7)))));
            }
            return aob;
        }
        final Object b2 = this.b;
        final adwl adwl = new adwl((adwl)this.a);
        final aib f = aob.f(7);
        final aib f2 = aob.f(32);
        final adtj adtj = (adtj)b2;
        ((BottomSheetBehavior)adtj.b).p = f.c;
        final boolean l = adds.L(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        final BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior)adtj.b;
        if (bottomSheetBehavior.i) {
            bottomSheetBehavior.o = aob.a();
            paddingBottom = adwl.d + ((BottomSheetBehavior)adtj.b).o;
        }
        final BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior)adtj.b;
        if (bottomSheetBehavior2.j) {
            int n;
            if (l) {
                n = adwl.c;
            }
            else {
                n = adwl.a;
            }
            paddingLeft = n + f.b;
        }
        if (bottomSheetBehavior2.k) {
            int n2;
            if (l) {
                n2 = adwl.a;
            }
            else {
                n2 = adwl.c;
            }
            paddingRight = n2 + f.d;
        }
        final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final boolean i = ((BottomSheetBehavior)adtj.b).l;
        final int n3 = 1;
        int n4 = 0;
        if (i) {
            final int leftMargin = layoutParams.leftMargin;
            final int b3 = f.b;
            n4 = n4;
            if (leftMargin != b3) {
                layoutParams.leftMargin = b3;
                n4 = 1;
            }
        }
        if (((BottomSheetBehavior)adtj.b).m) {
            final int rightMargin = layoutParams.rightMargin;
            final int d = f.d;
            if (rightMargin != d) {
                layoutParams.rightMargin = d;
                n4 = n3;
            }
        }
        Label_0485: {
            Label_0479: {
                if (((BottomSheetBehavior)adtj.b).n) {
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
        final boolean a2 = adtj.a;
        if (a2) {
            ((BottomSheetBehavior)adtj.b).g = f2.e;
        }
        final BottomSheetBehavior bottomSheetBehavior3 = (BottomSheetBehavior)adtj.b;
        if (bottomSheetBehavior3.i || a2) {
            bottomSheetBehavior3.M();
        }
        return aob;
    }
}
