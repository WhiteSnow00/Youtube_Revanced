import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwf extends agzi implements ahax
{
    public static final atwf a;
    private static volatile ahbe l;
    public int b;
    public int c;
    public long d;
    public String e;
    public String f;
    public atwp g;
    public int h;
    public long i;
    public atwo j;
    public long k;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(atwf.class, a = new atwf());
    }
    
    private atwf() {
        this.m = 2;
        this.e = "";
        this.f = "";
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe l;
                if ((l = atwf.l) == null) {
                    synchronized (atwf.class) {
                        if (atwf.l == null) {
                            atwf.l = (ahbe)new agzb((agzi)atwf.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return atwf.a;
            }
            case 4: {
                return new agza((agzi)atwf.a);
            }
            case 3: {
                return new atwf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwf.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u100c\u0005\u0003\u1002\u0006\u0006\u1009\u0007\u0007\u1002\b\b\u1005\u0001\t\u1008\u0002\n\u1008\u0003\u000b\u1409\u0004", new Object[] { "b", "c", atwe.a(), "h", atwe.a(), "i", "j", "k", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
