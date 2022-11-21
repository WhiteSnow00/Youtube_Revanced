import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnu extends ahcz implements aheo
{
    public static final ahnu a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public String e;
    
    static {
        final ahnu a2 = new ahnu();
        ahcz.registerDefaultInstance(ahnu.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 179, ahgc.k, ahnu.class);
    }
    
    private ahnu() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ahnu.f) == null) {
                    synchronized (ahnu.class) {
                        if (ahnu.f == null) {
                            ahnu.f = (ahev)new ahcs((ahcz)ahnu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahnu.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnu.a);
            }
            case 3: {
                return new ahnu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
