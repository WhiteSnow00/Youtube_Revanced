import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxq extends ahbh implements ahcw
{
    public static final aoxq a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private aiqj f;
    private aoxs g;
    private aoxr h;
    private ajut i;
    private ahhu j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxq.class, (ahbh)(a = new aoxq()));
    }
    
    private aoxq() {
        this.k = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoxq.b) == null) {
                    synchronized (aoxq.class) {
                        if (aoxq.b == null) {
                            aoxq.b = (ahdd)new ahba((ahbh)aoxq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxq.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxq.a);
            }
            case 3: {
                return new aoxq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxq.a, "\u0001\u0007\u0000\u0001\u0002\f\u0007\u0000\u0000\u0007\u0002\u1409\u0001\u0005\u1409\u0006\u0006\u1409\b\u0007\u1409\u0005\n\u1409\u000b\u000b\u1409\u0007\f\u1409\f", new Object[] { "c", "d", "f", "h", "e", "i", "g", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
