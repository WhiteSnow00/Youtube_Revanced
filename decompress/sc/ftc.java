import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.widget.SeekBar;
import android.view.View$OnTouchListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class ftc extends FrameLayout implements SeekBar$OnSeekBarChangeListener, View$OnTouchListener
{
    public final SeekBar a;
    public arkg b;
    public CommandOuterClass$Command c;
    public oum d;
    
    public ftc(final Context context) {
        super(context);
        LayoutInflater.from(context).inflate(2131624331, (ViewGroup)this);
        (this.a = (SeekBar)this.findViewById(2131431572)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            if (this.c != null) {
                final arkg b2 = this.b;
                if (b2 != null && b2.a() != null) {
                    final vgs a = ota.a();
                    a.i = this;
                    final ahbb ahbb = (ahbb)((ahbh)SenderStateOuterClass$SenderState.a).createBuilder();
                    final ahbf b3 = aqnw.b;
                    final ahaz builder = ((ahbh)aqnw.a).createBuilder();
                    builder.copyOnWrite();
                    final aqnw aqnw = (aqnw)builder.instance;
                    aqnw.c = 1;
                    aqnw.d = n;
                    ahbb.e((ahaq)b3, (Object)builder.build());
                    a.d = ((ahaz)ahbb).build();
                    ((otc)this.b.a()).a(this.c, a.f()).X();
                    return;
                }
                this.d.b(31, "OnChangeCommand provided but no usable command resolver found.");
            }
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
