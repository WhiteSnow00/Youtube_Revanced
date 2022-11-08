import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotg extends agzi implements ahax
{
    public static final aotg a;
    private static volatile ahbe d;
    public anss b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aotg.class, a = new aotg());
    }
    
    private aotg() {
        this.f = 2;
        this.c = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aotg.d) == null) {
                    synchronized (aotg.class) {
                        if (aotg.d == null) {
                            aotg.d = (ahbe)new agzb((agzi)aotg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aotg.a;
            }
            case 4: {
                return new agza((agzi)aotg.a);
            }
            case 3: {
                return new aotg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001a", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
