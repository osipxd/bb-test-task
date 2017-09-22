/*
 * This file is part of bb-test-task, licensed under the MIT License (MIT).
 *
 * Copyright (c) Osip Fatkullin <osip.fatkullin@gmail.com>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ru.endlesscode.bbtest.ui.fragment

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_users.*
import ru.endlesscode.bbtest.R
import ru.endlesscode.bbtest.mvp.model.User
import ru.endlesscode.bbtest.mvp.presenter.UsersPresenter
import ru.endlesscode.bbtest.mvp.view.UsersView
import ru.endlesscode.bbtest.ui.inflate

/**
 * A placeholder fragment containing a simple view.
 */
class UsersFragment : MvpAppCompatFragment(), UsersView {

    @InjectPresenter
    lateinit var usersPresenter: UsersPresenter

    private val usersList by lazy { users_list }
    private val buttonAdd by lazy { fab }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = container?.inflate(R.layout.fragment_users)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        buttonAdd.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun showError(message: String) {
        TODO("not implemented")
    }

    override fun onStartLoading() {
        TODO("not implemented")
    }

    override fun onFinishLoading() {
        TODO("not implemented")
    }

    override fun showRefreshing() {
        TODO("not implemented")
    }

    override fun hideRefreshing() {
        TODO("not implemented")
    }

    override fun openAddUserView() {
        TODO("not implemented")
    }

    override fun setUsers(users: List<User>) {
        TODO("not implemented")
    }
}