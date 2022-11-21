import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahni extends ahcz implements aheo
{
    public static final ahni a;
    private static volatile ahev f;
    public int b;
    public String c;
    public int d;
    public ahng e;
    
    static {
        ahcz.registerDefaultInstance(ahni.class, a = new ahni());
    }
    
    private ahni() {
        this.c = "";
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
                if ((f = ahni.f) == null) {
                    synchronized (ahni.class) {
                        if (ahni.f == null) {
                            ahni.f = (ahev)new ahcs((ahcz)ahni.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahni.a;
            }
            case 4: {
                return new ahcr((ahcz)ahni.a);
            }
            case 3: {
                return new ahni();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahni.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", ahqt.a(), "e" });
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
