import android.app.RemoteInput$Builder;
import android.app.RemoteInput;

// 
// Decompiled by Procyon v0.6.0
// 

final class agp
{
    static int a(final Object o) {
        return ((RemoteInput)o).getEditChoicesBeforeSending();
    }
    
    static RemoteInput$Builder b(final RemoteInput$Builder remoteInput$Builder, final int editChoicesBeforeSending) {
        return remoteInput$Builder.setEditChoicesBeforeSending(editChoicesBeforeSending);
    }
}
