import java.util.Arrays;
import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetc
{
    public final aetn a;
    public final aesm b;
    public final AccountId c;
    
    private aetc(final aetn a) {
        this.a = a;
        aetm aetm;
        if ((aetm = a.c) == null) {
            aetm = aetm.a;
        }
        this.b = new aesm(aetm);
        AccountId b;
        if ((a.b & 0x2) != 0x0) {
            b = AccountId.b(a.d);
        }
        else {
            b = null;
        }
        this.c = b;
    }
    
    public static aetc a(final aesm aesm) {
        final ahcr builder = aetn.a.createBuilder();
        final aetm a = aesm.a;
        builder.copyOnWrite();
        final aetn aetn = (aetn)builder.instance;
        a.getClass();
        aetn.c = a;
        aetn.b |= 0x1;
        return new aetc((aetn)builder.build());
    }
    
    static aetc b(final AccountId accountId, final aesm aesm) {
        final int a = accountId.a();
        final ahcr builder = aetn.a.createBuilder();
        final aetm a2 = aesm.a;
        builder.copyOnWrite();
        final aetn aetn = (aetn)builder.instance;
        a2.getClass();
        aetn.c = a2;
        aetn.b |= 0x1;
        builder.copyOnWrite();
        final aetn aetn2 = (aetn)builder.instance;
        aetn2.b |= 0x2;
        aetn2.d = a;
        return new aetc((aetn)builder.build());
    }
    
    public static aetc c(final aetn aetn) {
        return new aetc(aetn);
    }
    
    public final boolean d() {
        return this.c != null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof aetc) {
            final aetc aetc = (aetc)o;
            if (this.b.equals(aetc.b)) {
                final AccountId c = this.c;
                final AccountId c2 = aetc.c;
                if (c == null) {
                    if (c2 != null) {
                        return false;
                    }
                }
                else if (!c.equals(c2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c });
    }
}
