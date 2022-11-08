import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class gfh extends gfg
{
    public gfh(final View view, final boolean b) {
        super(view, b);
    }
    
    @Override
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
    
    @Override
    protected final void e(almd almd, final agzc agzc) {
        super.e(almd, agzc);
        if (agzc == null) {
            return;
        }
        final allx allx = (allx)agzc.build();
        final almd a = almd.a;
        final int ordinal = almd.ordinal();
        final ajsq ajsq = null;
        final ajsq ajsq2 = null;
        final ajsq ajsq3 = null;
        final ajsq ajsq4 = null;
        if (ordinal == 0) {
            final TextView textView = (TextView)this.d;
            Object text;
            if (this.c) {
                text = vwh.j(allx);
            }
            else {
                if ((almd = almd.b(allx.d)) == null) {
                    almd = almd.a;
                }
                if (almd == almd.a) {
                    ajsq ajsq5 = ajsq2;
                    if ((allx.b & 0x8) != 0x0 && (ajsq5 = allx.f) == null) {
                        ajsq5 = ajsq.a;
                    }
                    text = abyh.b(ajsq5);
                }
                else {
                    ajsq ajsq6 = ajsq3;
                    if ((allx.b & 0x10) != 0x0 && (ajsq6 = allx.g) == null) {
                        ajsq6 = ajsq.a;
                    }
                    text = abyh.b(ajsq6);
                }
            }
            textView.setText((CharSequence)text);
            return;
        }
        if (ordinal == 1) {
            final TextView textView2 = (TextView)this.d;
            Object text2;
            if (this.c) {
                if ((almd = almd.b(allx.d)) == null) {
                    almd = almd.a;
                }
                if (almd == almd.b) {
                    ajsq ajsq7 = ajsq4;
                    if ((allx.b & 0x100) != 0x0 && (ajsq7 = allx.j) == null) {
                        ajsq7 = ajsq.a;
                    }
                    text2 = abyh.b(ajsq7);
                }
                else {
                    ajsq ajsq8 = ajsq;
                    if ((allx.b & 0x200) != 0x0 && (ajsq8 = allx.k) == null) {
                        ajsq8 = ajsq.a;
                    }
                    text2 = abyh.b(ajsq8);
                }
            }
            else {
                text2 = vwh.k(allx);
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
            text3 = vwh.j(allx);
        }
        else {
            text3 = vwh.k(allx);
        }
        textView3.setText(text3);
    }
}
