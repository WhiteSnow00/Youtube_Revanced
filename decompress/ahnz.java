import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnz extends ahcz implements aheo
{
    public static final ahnz a;
    private static volatile ahev e;
    public int b;
    public aisc c;
    public String d;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ahnz.class, a = new ahnz());
    }
    
    private ahnz() {
        this.g = 2;
        this.d = "";
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ahnz.e) == null) {
                    synchronized (ahnz.class) {
                        if (ahnz.e == null) {
                            ahnz.e = (ahev)new ahcs((ahcz)ahnz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahnz.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnz.a);
            }
            case 3: {
                return new ahnz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnz.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0003\u0005\u1008\u0002", new Object[] { "b", "c", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
