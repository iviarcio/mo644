# Spark Notebook -- MC970/MO644 - Introdução à Programação Paralela

## What you will need to use the notebook

You will need to install the python compiler/interpreter, version 3.5+
You can download it [here](https://www.python.org/downloads).

To install Spark, make sure you have [Java 8 or higher installed on your
computer](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html).
Then, visit the [Spark downloads page](http://spark.apache.org/downloads.html).
Select the latest Spark release, a prebuilt package for Hadoop, and download it
directly. Unzip it in your $HOME folder:

```sh
    $ tar -xzf spark-2.3.0-bin-hadoop2.7.tgz
```

Tell your bash (or zsh, etc.) where to find Spark. To do so, configure your
$PATH variables by adding the following lines in your ~/.bashrc (or ~/.zshrc)
file:

```sh
    export SPARK_HOME=$HOME/spark-2.3.0-bin-hadoop2.7
    export PATH=$PATH:$SPARK_HOME/bin
    export PYSPARK_PYTHON=python3
```

## Jupyter Notebook

One of the most significant advances in the scientific computing arena is with
the explosion of interest in technology [Jupyter Notebook] (jupyter.org).  The
scientific publication Nature recently presented a article about the benefits
of Jupyter notebooks for scientific research.  Jupyter Notebook is nothing more
than an open source WEB application that allows you to create and share
documents that contain code, equations, visualizations and narrative text.

You will need to install the Jupyter Notebook and some extensions to use the
course material. With Python3 already installed on your machine, run in the
terminal:

```sh
    $ pip3 install jupyter
    $ pip3 install jupyter_contrib_nbextensions
    $ jupyter contrib nbextension install --user
```
To use the required extensions, you'll also need to enable them. To do this,
you can use a Jupyter subcommand:

```sh
    $ jupyter nbextension enable codefolding/main
    $ jupyter nbextension enable latex_envs/latex_envs
    $ jupyter nbextension enable python-markdown/main
    $ jupyter nbextension enable toc2/main
```

## PySpark in Jupyter

There are two ways to get PySpark available in a Jupyter Notebook:

 - Configure PySpark driver to use Jupyter Notebook: running pyspark will
   automatically open a Jupyter Notebook
 - Load a regular Jupyter Notebook and load PySpark using findSpark package

First option is quicker but specific to Jupyter Notebook, second option is a
broader approach to get PySpark available in your favorite IDE. We will only use the second method.  To install findspark:

```sh
   $ pip3 install findspark
```

## Jupyter Scala

Jupyter Scala is a Scala kernel for Jupyter. Clone or download the Jupyter
Scala to your $HOME folder and then simply run the jupyter-scala script of this
repository to install the kernel.

```sh
    $ git clone https://github.com/jupyter-scala/jupyter-scala.git
    $ cd jupyter-scala
    $ ./jupyter-scala
```

After you install the software packages on your computer, you are ready to run the notebook server. You can start the notebook server from the command line. Download the Spark Notebook and run the jupyter notebook in the folder where you downloaded this notebook:

```sh
    $ git clone https://github.com/iviarcio/mo644.git
    $ cd mo644
    $ jupyter notebook
```

This will print some information about the notebook server in your terminal,
including the web application URL (by default, http://localhost:8888) and
how to close the application:

```sh
    $ jupyter notebook,
    [I 15:48:52.941 NotebookApp] [jupyter_nbextensions_configurator] enabled 0.4.0
    [I 15:48:53.153 NotebookApp] Jupyter-Spark enabled!
    [I 15:48:53.579 NotebookApp] Serving notebooks from local directory: /Users/marcio/Unicamp/MO644
    [I 15:48:53.579 NotebookApp] 0 active kernels
    [I 15:48:53.579 NotebookApp] The Jupyter Notebook is running at:
    [I 15:48:53.579 NotebookApp] http://localhost:8888/?token=9732cbcdfd853b539e3aefe44c89aa186bd94cf7127fd810
    [I 15:48:53.579 NotebookApp] Use Control-C to stop this server and shut down all kernels (twice to skip confirmation).
    [C 15:48:53.585 NotebookApp]

    Copy/paste this URL into your browser when you connect for the first time,
    to login with a token:
        http://localhost:8888/?token=9732cbcdfd853b539e3aefe44c89aa186bd94cf7127fd810
    [I 15:48:56.773 NotebookApp] Accepting one-time-token-authenticated connection from ::1
```

Next, jupyter will open your default web browser for this URL. When the
notebook open in your browser, you will see the Notebook Dashboard, which will
show a list of notebooks, files and subdirectories in the directory where the
notebook server started. Most of the time, you want to start the notebook
server in the directory that contains the MO644 course workbooks. Often this
will be your home directory.
