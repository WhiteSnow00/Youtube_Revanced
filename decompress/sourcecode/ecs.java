import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class ecs extends LinearLayoutManager
{
    public ecs(final int n) {
        super(n);
    }
    
    public final nx f() {
        nx nx;
        if (super.i == 1) {
            nx = new nx(-1, -2);
        }
        else {
            nx = new nx(-2, -1);
        }
        return nx;
    }
    
    public final boolean rl() {
        return super.i != 0 && super.rl();
    }
}