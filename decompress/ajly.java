import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajly extends ahcz implements aheo
{
    public static final ajly a;
    private static volatile ahev m;
    public int b;
    public String c;
    public long d;
    public long e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public ahdh j;
    public ahbt k;
    public int l;
    
    static {
        ahcz.registerDefaultInstance(ajly.class, a = new ajly());
    }
    
    private ajly() {
        this.c = "";
        this.g = "";
        this.h = "";
        final ahbt b = ahbt.b;
        this.i = "";
        this.j = ahcz.emptyIntList();
        this.k = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = ajly.m) == null) {
                    synchronized (ajly.class) {
                        if (ajly.m == null) {
                            ajly.m = (ahev)new ahcs((ahcz)ajly.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajly.a;
            }
            case 4: {
                return new ahcr((char[])null, (short[][])null);
            }
            case 3: {
                return new ajly();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajly.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1007\u0003\u0005\u1008\u0004\u0006\u1008\u0005\b\u1008\u0007\t\u0016\n\u100a\b\u000b\u1004\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
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
