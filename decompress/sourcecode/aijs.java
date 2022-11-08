import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijs extends agzi implements ahax
{
    public static final aijs a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public aijw d;
    public agzy e;
    public ando f;
    public int g;
    
    static {
        agzi.registerDefaultInstance(aijs.class, a = new aijs());
    }
    
    private aijs() {
        this.e = agzi.emptyProtobufList();
        emptyLongList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = aijs.h) == null) {
                    synchronized (aijs.class) {
                        if (aijs.h == null) {
                            aijs.h = (ahbe)new agzb((agzi)aijs.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aijs.a;
            }
            case 4: {
                return new agza((char[][])null, (short[])null);
            }
            case 3: {
                return new aijs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijs.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1009\u0001\u0004\u001b\u0006\u1009\u0003\u0007\u100c\u0004", new Object[] { "b", "c", aijn.c, "d", "e", aijr.class, "f", "g", aijn.d });
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
