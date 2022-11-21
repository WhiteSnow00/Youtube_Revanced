import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anva extends ahcz implements aheo
{
    public static final anva a;
    private static volatile ahev h;
    public int b;
    public String c;
    public String d;
    public int e;
    public String f;
    public int g;
    
    static {
        ahcz.registerDefaultInstance(anva.class, a = new anva());
    }
    
    private anva() {
        this.c = "";
        this.d = "";
        this.f = "";
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
                if ((h = anva.h) == null) {
                    synchronized (anva.class) {
                        if (anva.h == null) {
                            anva.h = (ahev)new ahcs((ahcz)anva.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anva.a;
            }
            case 4: {
                return new ahcr((ahcz)anva.a);
            }
            case 3: {
                return new anva();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anva.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100b\u0002\u0004\u1008\u0003\u0005\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", anus.d });
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
