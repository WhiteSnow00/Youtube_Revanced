import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpg extends ahcz implements aheo
{
    public static final adpg a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(adpg.class, a = new adpg());
    }
    
    private adpg() {
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
                final ahev d;
                if ((d = adpg.d) == null) {
                    synchronized (adpg.class) {
                        if (adpg.d == null) {
                            adpg.d = (ahev)new ahcs((ahcz)adpg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return adpg.a;
            }
            case 4: {
                return new ahcr((ahcz)adpg.a);
            }
            case 3: {
                return new adpg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adpg.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "b", "c" });
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
