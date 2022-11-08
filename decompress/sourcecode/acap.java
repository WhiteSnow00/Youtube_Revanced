import com.google.android.libraries.elements.interfaces.PublicKeyVerifier;
import com.google.android.libraries.elements.interfaces.PublicKeyVerifierProvider;

// 
// Decompiled by Procyon v0.6.0
// 

final class acap extends PublicKeyVerifierProvider
{
    public acap() {
    }
    
    public final PublicKeyVerifier createVerifier() {
        return new acao();
    }
}
