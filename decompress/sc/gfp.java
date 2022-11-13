import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class gfp extends gfo
{
    public gfp(final View view, final boolean b) {
        super(view, b);
    }
    
    public final void b(final boolean enabled) {
        this.d.setEnabled(enabled);
        final View d = this.d;
        float alpha;
        if (!enabled) {
            alpha = 0.2f;
        }
        else {
            alpha = 1.0f;
        }
        d.setAlpha(alpha);
    }
    
    protected final void e(alog alog, final ahbb ahbb) {
        super.e(alog, ahbb);
        if (ahbb == null) {
            return;
        }
        final aloa aloa = (aloa)((ahaz)ahbb).build();
        final alog a = alog.a;
        final int ordinal = alog.ordinal();
        final ajut ajut = null;
        final ajut ajut2 = null;
        final ajut ajut3 = null;
        final ajut ajut4 = null;
        if (ordinal == 0) {
            final TextView textView = (TextView)this.d;
            Object text;
            if (this.c) {
                text = vyg.l(aloa);
            }
            else {
                if ((alog = alog.b(aloa.d)) == null) {
                    alog = alog.a;
                }
                if (alog == alog.a) {
                    ajut ajut5 = ajut2;
                    if ((aloa.b & 0x8) != 0x0 && (ajut5 = aloa.f) == null) {
                        ajut5 = ajut.a;
                    }
                    text = acak.b(ajut5);
                }
                else {
                    ajut ajut6 = ajut3;
                    if ((aloa.b & 0x10) != 0x0 && (ajut6 = aloa.g) == null) {
                        ajut6 = ajut.a;
                    }
                    text = acak.b(ajut6);
                }
            }
            textView.setText((CharSequence)text);
            return;
        }
        if (ordinal == 1) {
            final TextView textView2 = (TextView)this.d;
            Object text2;
            if (this.c) {
                if ((alog = alog.b(aloa.d)) == null) {
                    alog = alog.a;
                }
                if (alog == alog.b) {
                    ajut ajut7 = ajut4;
                    if ((aloa.b & 0x100) != 0x0 && (ajut7 = aloa.j) == null) {
                        ajut7 = ajut.a;
                    }
                    text2 = acak.b(ajut7);
                }
                else {
                    ajut ajut8 = ajut;
                    if ((aloa.b & 0x200) != 0x0 && (ajut8 = aloa.k) == null) {
                        ajut8 = ajut.a;
                    }
                    text2 = acak.b(ajut8);
                }
            }
            else {
                text2 = vyg.m(aloa);
            }
            textView2.setText((CharSequence)text2);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        final TextView textView3 = (TextView)this.d;
        CharSequence text3;
        if (this.c) {
            text3 = vyg.l(aloa);
        }
        else {
            text3 = vyg.m(aloa);
        }
        textView3.setText(text3);
    }
}
