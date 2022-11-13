import android.support.v7.widget.RecyclerView;
import android.graphics.Canvas;
import android.content.Context;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hby extends uru
{
    private final Paint b;
    
    public hby(final Context context) {
        super(context);
        this.a = context.getResources().getDimensionPixelSize(2131166557);
        (this.b = new Paint()).setColor(tpe.cx(context, 2130970845).orElse(context.getResources().getColor(2131102421)));
    }
    
    public final void c(final Canvas canvas, final RecyclerView recyclerView) {
        canvas.drawRect(0.0f, (float)recyclerView.getTop(), (float)recyclerView.getRight(), (float)recyclerView.getBottom(), this.b);
    }
}
