/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Buffer region struct.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code origin} &ndash; the region offset, in bytes</li>
 * <li>{@code size} &ndash; the region size, in bytes</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_buffer_region {
 *     size_t origin;
 *     size_t size;
 * }</code></pre>
 */
@NativeType("struct cl_buffer_region")
public class CLBufferRegion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ORIGIN,
        SIZE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ORIGIN = layout.offsetof(0);
        SIZE = layout.offsetof(1);
    }

    CLBufferRegion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link CLBufferRegion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLBufferRegion(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code origin} field. */
    @NativeType("size_t")
    public long origin() { return norigin(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("size_t")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code origin} field. */
    public CLBufferRegion origin(@NativeType("size_t") long value) { norigin(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public CLBufferRegion size(@NativeType("size_t") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLBufferRegion set(
        long origin,
        long size
    ) {
        origin(origin);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLBufferRegion set(CLBufferRegion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link CLBufferRegion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLBufferRegion malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link CLBufferRegion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLBufferRegion calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link CLBufferRegion} instance allocated with {@link BufferUtils}. */
    public static CLBufferRegion create() {
        return new CLBufferRegion(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link CLBufferRegion} instance for the specified memory address. */
    public static CLBufferRegion create(long address) {
        return new CLBufferRegion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLBufferRegion createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link CLBufferRegion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLBufferRegion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link CLBufferRegion} instance allocated on the thread-local {@link MemoryStack}. */
    public static CLBufferRegion mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link CLBufferRegion} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CLBufferRegion callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link CLBufferRegion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLBufferRegion mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link CLBufferRegion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLBufferRegion callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBufferRegion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLBufferRegion.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #origin}. */
    public static long norigin(long struct) { return memGetAddress(struct + CLBufferRegion.ORIGIN); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetAddress(struct + CLBufferRegion.SIZE); }

    /** Unsafe version of {@link #origin(long) origin}. */
    public static void norigin(long struct, long value) { memPutAddress(struct + CLBufferRegion.ORIGIN, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutAddress(struct + CLBufferRegion.SIZE, value); }

    // -----------------------------------

    /** An array of {@link CLBufferRegion} structs. */
    public static class Buffer extends StructBuffer<CLBufferRegion, Buffer> implements NativeResource {

        /**
         * Creates a new {@link CLBufferRegion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLBufferRegion#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected CLBufferRegion newInstance(long address) {
            return new CLBufferRegion(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code origin} field. */
        @NativeType("size_t")
        public long origin() { return CLBufferRegion.norigin(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("size_t")
        public long size() { return CLBufferRegion.nsize(address()); }

        /** Sets the specified value to the {@code origin} field. */
        public CLBufferRegion.Buffer origin(@NativeType("size_t") long value) { CLBufferRegion.norigin(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public CLBufferRegion.Buffer size(@NativeType("size_t") long value) { CLBufferRegion.nsize(address(), value); return this; }

    }

}