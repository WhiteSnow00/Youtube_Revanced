import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agft extends agzi implements ahax
{
    public static final agft a;
    private static volatile ahbe j;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public String g;
    public int h;
    public String i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(agft.class, a = new agft());
    }
    
    private agft() {
        this.c = 0;
        this.e = 0;
        this.k = 2;
        this.g = "";
        this.i = "";
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
                final ahbe j;
                if ((j = agft.j) == null) {
                    synchronized (agft.class) {
                        if (agft.j == null) {
                            agft.j = (ahbe)new agzb((agzi)agft.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agft.a;
            }
            case 4: {
                return new agza((agzi)agft.a);
            }
            case 3: {
                return new agft();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agft.a, "\u0001\u0007\u0002\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001\u103b\u0000\u0002\u1008\u0003\u0003\u100c\u0005\u0005\u103c\u0001\u0006\u103c\u0000\n\u1008\u0007\u000b\u143c\u0000", new Object[] { "d", "c", "f", "e", "b", "g", "h", afon.d, agfs.class, agfq.class, "i", agfr.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
