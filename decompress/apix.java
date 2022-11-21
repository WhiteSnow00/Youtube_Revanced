import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apix extends ahcz implements aheo
{
    public static final apix a;
    private static volatile ahev h;
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    
    static {
        ahcz.registerDefaultInstance(apix.class, a = new apix());
    }
    
    private apix() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = apix.h) == null) {
                    synchronized (apix.class) {
                        if (apix.h == null) {
                            apix.h = (ahev)new ahcs((ahcz)apix.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apix.a;
            }
            case 4: {
                return new ahcr((ahcz)apix.a);
            }
            case 3: {
                return new apix();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apix.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
