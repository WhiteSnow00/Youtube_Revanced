import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aha
{
    public static Executor a(final Context context) {
        return context.getMainExecutor();
    }
}
