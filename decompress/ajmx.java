import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmx extends ahcz implements aheo
{
    public static final ajmx a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahbt d;
    
    static {
        ahcz.registerDefaultInstance(ajmx.class, a = new ajmx());
    }
    
    private ajmx() {
        this.c = "";
        this.d = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ajmx.e) == null) {
                    synchronized (ajmx.class) {
                        if (ajmx.e == null) {
                            ajmx.e = (ahev)new ahcs((ahcz)ajmx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajmx.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmx.a);
            }
            case 3: {
                return new ajmx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
