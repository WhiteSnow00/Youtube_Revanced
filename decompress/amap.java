import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amap extends ahcz implements aheo
{
    public static final amap a;
    public static final ahcx b;
    private static volatile ahev h;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    
    static {
        final amap a2 = new amap();
        ahcz.registerDefaultInstance(amap.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 158, ahgc.k, amap.class);
    }
    
    private amap() {
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
        this.f = "";
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
                if ((h = amap.h) == null) {
                    synchronized (amap.class) {
                        if (amap.h == null) {
                            amap.h = (ahev)new ahcs((ahcz)amap.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amap.a;
            }
            case 4: {
                return new ahcr((ahcz)amap.a);
            }
            case 3: {
                return new amap();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amap.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "c", "d", "e", "f", "g" });
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
