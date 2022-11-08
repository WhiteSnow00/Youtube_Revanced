import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyb extends agzi implements ahax
{
    public static final akyb a;
    private static volatile ahbe h;
    public int b;
    public akjd c;
    public agzy d;
    public String e;
    public String f;
    public ampk g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)akyb.class, (agzi)(a = new akyb()));
    }
    
    private akyb() {
        this.i = 2;
        this.d = agzi.emptyProtobufList();
        this.e = "";
        this.f = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = akyb.h) == null) {
                    synchronized (akyb.class) {
                        if (akyb.h == null) {
                            akyb.h = (ahbe)new agzb((agzi)akyb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akyb.a;
            }
            case 4: {
                return new agza((float[][])null, (float[][])null);
            }
            case 3: {
                return new akyb();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyb.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
