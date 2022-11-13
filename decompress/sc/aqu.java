import androidx.cardview.widget.CardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqu
{
    public Object a;
    public final Object b;
    
    public aqu(final CardView b) {
        this.b = b;
    }
    
    public aqu(final aqv b) {
        this.b = b;
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4) {
        ((CardView)this.b).d.set(n, n2, n3, n4);
        final CardView cardView = (CardView)this.b;
        CardView.c(cardView, n + cardView.c.left, n2 + ((CardView)this.b).c.top, n3 + ((CardView)this.b).c.right, n4 + ((CardView)this.b).c.bottom);
    }
    
    public final boolean b() {
        return ((CardView)this.b).b;
    }
    
    public final boolean c() {
        return ((CardView)this.b).a;
    }
}
