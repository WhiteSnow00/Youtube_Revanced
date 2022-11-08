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

final class fsu extends FrameLayout implements SeekBar$OnSeekBarChangeListener, View$OnTouchListener
{
    public final SeekBar a;
    public arhr b;
    public CommandOuterClass$Command c;
    public otd d;
    
    public fsu(final Context context) {
        super(context);
        LayoutInflater.from(context).inflate(2131624332, (ViewGroup)this);
        (this.a = (SeekBar)this.findViewById(2131431569)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            if (this.c != null) {
                final arhr b2 = this.b;
                if (b2 != null && b2.a() != null) {
                    final ves a = orr.a();
                    a.i = this;
                    final agzc agzc = (agzc)((agzi)SenderStateOuterClass$SenderState.a).createBuilder();
                    final agzg b3 = aqlk.b;
                    final agza builder = ((agzi)aqlk.a).createBuilder();
                    builder.copyOnWrite();
                    final aqlk aqlk = (aqlk)builder.instance;
                    aqlk.c = 1;
                    aqlk.d = n;
                    agzc.e((agyr)b3, (Object)builder.build());
                    a.d = ((agza)agzc).build();
                    ((ort)this.b.a()).a(this.c, a.f()).X();
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
