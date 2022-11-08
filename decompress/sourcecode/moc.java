import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class moc extends ClassLoader
{
    @Override
    protected final Class loadClass(final String s, final boolean b) {
        if ("com.google.android.gms.iid.MessengerCompat".equals(s)) {
            return CloudMessagingMessengerCompat.class;
        }
        return super.loadClass(s, b);
    }
}
