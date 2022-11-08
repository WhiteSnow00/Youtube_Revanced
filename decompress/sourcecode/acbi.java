import io.grpc.Status$Code;
import io.grpc.Status;
import com.google.android.libraries.elements.interfaces.ValidationResult;
import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acbi extends ResourceLoaderDelegate
{
    private final acah a;
    private final otd b;
    
    public acbi(final acah a, final otd b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onAttemptedToCacheResource(final String s, final ValidationResult validationResult, final Status status) {
        final ValidationResult unknown = ValidationResult.UNKNOWN;
        final int ordinal = validationResult.ordinal();
        if (ordinal == 0) {
            this.b.b(32, "ELMCache: Error caching resource due to unknown reason: ".concat(String.valueOf(s)));
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (status.getCode() == Status$Code.i) {
            final otd b = this.b;
            final String name = status.getCode().name();
            final String description = status.getDescription();
            final StringBuilder sb = new StringBuilder("ELMCache: Resource was not cached because the cache filled up while writing. Identifier: ");
            sb.append(s);
            sb.append(". Error details: ");
            sb.append(name);
            sb.append(" ");
            sb.append(description);
            b.b(34, sb.toString());
            return;
        }
        final otd b2 = this.b;
        final String name2 = status.getCode().name();
        final String description2 = status.getDescription();
        final StringBuilder sb2 = new StringBuilder("ELMCache: Error caching resource due to failure: ");
        sb2.append(s);
        sb2.append(". Error details: ");
        sb2.append(name2);
        sb2.append(" ");
        sb2.append(description2);
        b2.b(32, sb2.toString());
    }
    
    public final void onMissingCacheDependency(final String s) {
        this.b.b(32, "ELMCache: The following resource is missing during caching: ".concat(String.valueOf(s)));
    }
    
    public final void onResourceCachePrepared(final String s, final Status status) {
        if (!status.f()) {
            final otd b = this.b;
            final String name = status.getCode().name();
            final String description = status.getDescription();
            final StringBuilder sb = new StringBuilder("ELMCache: Error preparing resource for caching: ");
            sb.append(s);
            sb.append(". Error details: ");
            sb.append(name);
            sb.append(" ");
            sb.append(description);
            b.b(32, sb.toString());
        }
    }
    
    public final void onResourceProcessed(final String s, final ValidationResult validationResult, final Status status) {
        final ValidationResult unknown = ValidationResult.UNKNOWN;
        final int ordinal = validationResult.ordinal();
        if (ordinal == 0) {
            this.b.b(32, "Error loading resource due to unknown reason: ".concat(String.valueOf(s)));
            return;
        }
        if (ordinal == 1) {
            this.a.d.add(s);
            final acah a = this.a;
            asgn asgn;
            if (a.d() && a.e()) {
                asgn = asgn.u((asir)new tlv(a, 18));
            }
            else {
                asgn = asgn.f();
            }
            asgn.F(atio.a()).U();
            return;
        }
        if (ordinal != 2) {
            return;
        }
        final otd b = this.b;
        final String name = status.getCode().name();
        final String description = status.getDescription();
        final StringBuilder sb = new StringBuilder("Error loading resource due to failure: ");
        sb.append(s);
        sb.append(". Error details: ");
        sb.append(name);
        sb.append(" ");
        sb.append(description);
        b.b(32, sb.toString());
    }
    
    public final void onServingContextUpdated(final byte[] array) {
        this.a.e.set(agyc.x(array));
    }
}
