import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcd extends ahcz implements aheo
{
    private static final arcd a;
    private static volatile ahev b;
    private int c;
    private int d;
    private boolean e;
    
    static {
        ahcz.registerDefaultInstance(arcd.class, a = new arcd());
    }
    
    private arcd() {
        this.d = 1;
    }
    
    public static arcd b() {
        return arcd.a;
    }
    
    public static arcd c() {
        return arcd.a;
    }
    
    public arbi a() {
        arbi arbi;
        if ((arbi = arbi.b(this.d)) == null) {
            arbi = arbi.a;
        }
        return arbi;
    }
    
    public boolean d() {
        return this.e;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arcd.b) == null) {
                    synchronized (arcd.class) {
                        if (arcd.b == null) {
                            arcd.b = (ahev)new ahcs((ahcz)arcd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arcd.a;
            }
            case 4: {
                return new ahcr((ahcz)b());
            }
            case 3: {
                return new arcd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "c", "d", arbi.a(), "e" });
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
