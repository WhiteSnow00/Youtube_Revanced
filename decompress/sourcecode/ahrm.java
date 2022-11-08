import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrm extends agzi implements ahax
{
    public static final ahrm a;
    private static volatile ahbe f;
    public int b;
    public aioe c;
    public aioe d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahrm.class, a = new ahrm());
    }
    
    private ahrm() {
        this.g = 2;
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
                final ahbe f;
                if ((f = ahrm.f) == null) {
                    synchronized (ahrm.class) {
                        if (ahrm.f == null) {
                            ahrm.f = (ahbe)new agzb((agzi)ahrm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahrm.a;
            }
            case 4: {
                return new agza((agzi)ahrm.a);
            }
            case 3: {
                return new ahrm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", amom.n });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
