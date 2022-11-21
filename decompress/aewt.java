// 
// Decompiled by Procyon v0.6.0
// 

final class aewt implements aewq
{
    public aewt() {
    }
    
    @Override
    public final aewr a(final aewu aewu) {
        synchronized (aewu) {
            return aewu.currentMetadata;
        }
    }
}
