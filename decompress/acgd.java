import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.view.KeyEvent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgd implements DialogInterface$OnKeyListener
{
    public final acgf a;
    public final aoiu b;
    public final ots c;
    
    public acgd(final acgf a, final aoiu b, final ots c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        final acgf a = this.a;
        final aoiu b = this.b;
        final ots c = this.c;
        boolean b2 = false;
        if (n == 4) {
            b2 = b2;
            if (keyEvent.getAction() == 1) {
                final otu otu = (otu)a.b.a();
                CommandOuterClass$Command commandOuterClass$Command;
                if ((commandOuterClass$Command = b.h) == null) {
                    commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                }
                otu.a(commandOuterClass$Command, c).U();
                b2 = true;
            }
        }
        return b2;
    }
}
