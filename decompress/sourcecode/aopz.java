import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopz extends agzi implements ahax
{
    public static final aopz a;
    public static final agzg b;
    private static volatile ahbe i;
    public int c;
    public boolean d;
    public agzy e;
    public agzy f;
    public agzy g;
    public int h;
    
    static {
        final aopz a2 = new aopz();
        agzi.registerDefaultInstance(aopz.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 368511790, ahcm.k, aopz.class);
    }
    
    private aopz() {
        this.e = agzi.emptyProtobufList();
        this.f = agzi.emptyProtobufList();
        this.g = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = aopz.i) == null) {
                    synchronized (aopz.class) {
                        if (aopz.i == null) {
                            aopz.i = (ahbe)new agzb((agzi)aopz.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aopz.a;
            }
            case 4: {
                return new agza((agzi)aopz.a);
            }
            case 3: {
                return new aopz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aopz.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001\u1007\u0000\u0002\u001a\u0004\u001a\u0005\u001b\u0006\u100c\u0001", new Object[] { "c", "d", "e", "g", "f", agyo.class, "h", apfn.s });
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
