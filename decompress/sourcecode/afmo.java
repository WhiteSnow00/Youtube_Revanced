import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afmo extends afmd implements Serializable
{
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;
    
    public afmo() {
        final MessageDigest b = b("SHA-256");
        this.a = b;
        this.b = b.getDigestLength();
        this.d = "Hashing.sha256()";
        this.c = c(b);
    }
    
    public afmo(final String s, final int b) {
        this.d = "Hashing.sha256()";
        final MessageDigest b2 = b(s);
        this.a = b2;
        final int digestLength = b2.getDigestLength();
        boolean b3 = false;
        if (b >= 4) {
            b3 = b3;
            if (b <= digestLength) {
                b3 = true;
            }
        }
        agot.A(b3, "bytes (%s) must be >= 4 and < %s", b, digestLength);
        this.b = b;
        this.c = c(b2);
    }
    
    private static MessageDigest b(final String s) {
        try {
            return MessageDigest.getInstance(s);
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    private static boolean c(final MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        }
        catch (final CloneNotSupportedException ex) {
            return false;
        }
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public final afmj a() {
        Label_0031: {
            if (!this.c) {
                break Label_0031;
            }
            try {
                return (afmj)new afmm((MessageDigest)this.a.clone(), this.b);
                return (afmj)new afmm(b(this.a.getAlgorithm()), this.b);
            }
            catch (final CloneNotSupportedException ex) {
                return (afmj)new afmm(b(this.a.getAlgorithm()), this.b);
            }
        }
    }
    
    @Override
    public final String toString() {
        return this.d;
    }
    
    Object writeReplace() {
        return new afmn(this.a.getAlgorithm(), this.b);
    }
}
