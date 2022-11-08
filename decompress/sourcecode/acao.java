import io.grpc.Status;
import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;

// 
// Decompiled by Procyon v0.6.0
// 

final class acao extends PublicKeyVerifier
{
    public acao() {
    }
    
    public final Status initialize(final String s, final byte[] array, final byte[] array2) {
        return Status.OK;
    }
    
    public final Status verify(final byte[] array, final byte[] array2) {
        return Status.OK;
    }
}
