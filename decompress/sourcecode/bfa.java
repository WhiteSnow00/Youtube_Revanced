// 
// Decompiled by Procyon v0.6.0
// 

public final class bfa extends RuntimeException
{
    public final int a;
    
    public bfa(final int a) {
        String s;
        if (a != 1) {
            if (a != 2) {
                s = "Detaching surface timed out.";
            }
            else {
                s = "Setting foreground mode timed out.";
            }
        }
        else {
            s = "Player release timed out.";
        }
        super(s);
        this.a = a;
    }
}
